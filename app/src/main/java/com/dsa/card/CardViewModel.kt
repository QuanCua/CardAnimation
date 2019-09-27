package com.dsa.card

import androidx.lifecycle.LiveData


data class CardViewModel(
        val logo: LiveData<Int>,
        val background: LiveData<Int>,
        val title: LiveData<String>
)