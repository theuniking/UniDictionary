package com.timecoders.unidictionary.feature_dictionary.domain.repository

import com.timecoders.unidictionary.core.util.Resource
import com.timecoders.unidictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word:String): Flow<Resource<List<WordInfo>>>
}