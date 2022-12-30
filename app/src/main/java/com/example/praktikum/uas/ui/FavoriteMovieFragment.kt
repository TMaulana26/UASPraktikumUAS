package com.example.praktikum.uas.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.praktikum.R
import com.example.praktikum.databinding.FragmentFavoriteMovieBinding
import com.example.praktikum.uas.data.model.viewparam.MovieViewParam
import com.example.praktikum.uas.utils.Resource
import com.example.praktikum.uas.utils.ViewModelFactory

class FavoriteMovieFragment : Fragment() {

    private var _binding: FragmentFavoriteMovieBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MovieViewModel by viewModels(factoryProducer = {
        ViewModelFactory.getInstance(requireActivity().application)
    })

    private val adapter: ListMovieAdapter by lazy { ListMovieAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoriteMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        observeData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initView() {
        setupRecyclerView()
    }

    private fun observeData() {
        viewModel.favoriteMovies.observe(viewLifecycleOwner) { resource ->
            when (resource) {
                is Resource.Loading -> {
                    Toast.makeText(requireContext(), "Loading Favorite Movies", Toast.LENGTH_SHORT).show()
                }
                is Resource.Success -> {
                    adapter.submitList(resource.data)
                    adapter.setOnClickFavoriteListener { movie ->
                        updateFavoriteMovie(movie)
                    }
                }
                is Resource.Error -> {
                    Toast.makeText(requireContext(), "Error", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun setupRecyclerView() {
        binding.apply {
            rvMovies.adapter = adapter
            rvMovies.layoutManager = GridLayoutManager(
                requireContext(),
               3
            )
        }
    }

    private fun updateFavoriteMovie(movie: MovieViewParam) {
        if (movie.isFavorite) {
            viewModel.updateFavorite(false, movie.id)
        } else {
            viewModel.updateFavorite(true, movie.id)
        }
    }

}