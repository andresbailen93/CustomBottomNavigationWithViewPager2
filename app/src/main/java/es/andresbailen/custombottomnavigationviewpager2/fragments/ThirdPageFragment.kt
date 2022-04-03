package es.andresbailen.custombottomnavigationviewpager2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import es.andresbailen.custombottomnavigationviewpager2.databinding.FragmentThirdPageBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ThirdPageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdPageFragment : Fragment() {
    private lateinit var binding: FragmentThirdPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ThirdPageFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            ThirdPageFragment()

    }
}