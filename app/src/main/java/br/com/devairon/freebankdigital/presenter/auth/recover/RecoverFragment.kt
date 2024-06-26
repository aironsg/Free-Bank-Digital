package br.com.devairon.freebankdigital.presenter.auth.recover

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.devairon.freebankdigital.R
import br.com.devairon.freebankdigital.databinding.FragmentRecoverBinding

class RecoverFragment : Fragment() {

    private var _binding: FragmentRecoverBinding? =  null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecoverBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding  = null
    }


}