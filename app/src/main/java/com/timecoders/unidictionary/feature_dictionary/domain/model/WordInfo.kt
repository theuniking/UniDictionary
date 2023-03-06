package com.timecoders.unidictionary.feature_dictionary.domain.model

import com.timecoders.unidictionary.feature_dictionary.data.remote.dto.LicenseDto
import com.timecoders.unidictionary.feature_dictionary.data.remote.dto.MeaningDto
import com.timecoders.unidictionary.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String?,
    val word: String
    )
