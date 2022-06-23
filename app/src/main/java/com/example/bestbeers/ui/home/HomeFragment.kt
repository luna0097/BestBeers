package com.example.bestbeers.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bestbeers.databinding.FragmentHomeBinding
import com.example.bestbeers.ui.home.adapter.BeersRecyclerViewAdapter
import com.example.bestbeers.ui.home.viewModel.HomeViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var rvBeers: RecyclerView
    private val beersList = listOf<String>("Indio", "Tecate", "Pacifico")

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
        }

        initRecyclerView()

        return root
    }

    private fun initRecyclerView(){
        rvBeers = binding.rvBeers
        rvBeers.layoutManager = LinearLayoutManager(context)
        rvBeers.adapter = BeersRecyclerViewAdapter {
            Log.d("TAG", "RecyclerView: Holi")
        }
        (rvBeers.adapter as BeersRecyclerViewAdapter).setData(beersList)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}