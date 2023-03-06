package com.timecoders.unidictionary.feature_dictionary.presentation

import com.timecoders.unidictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
