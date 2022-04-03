package es.andresbailen.custombottomnavigationviewpager2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.andresbailen.custombottomnavigationviewpager2.databinding.FragmentSecondPageBinding


/**
 * A simple [Fragment] subclass.
 * Use the [SecondPageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondPageFragment : Fragment() {
    private lateinit var binding: FragmentSecondPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondPageBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondPageFragment()
    }
}