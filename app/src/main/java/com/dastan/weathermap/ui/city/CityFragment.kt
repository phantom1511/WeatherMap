package com.dastan.weathermap.ui.city

import android.os.Bundle
import android.os.CountDownTimer
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import com.dastan.weathermap.R
import kotlinx.android.synthetic.main.fragment_city.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CityFragment : Fragment() {
    lateinit var search:EditText
    lateinit var timer:CountDownTimer
    private val adapter = CityAdapter()
    val cViewModel: CityViewModel by viewModel()
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_city, container, false)
        search = view.findViewById(R.id.search_field)

        search()
        return view
    }

    private fun search(){
        search.run {
            this.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                }

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    timer.start()
                }
            })
            this.setOnEditorActionListener { v, actionId, event ->
                return@setOnEditorActionListener when (actionId) {
                    EditorInfo.IME_ACTION_SEND -> {
                        timer.onFinish()
                        true
                    }
                    else -> false
                }
            }
        }
    }
}