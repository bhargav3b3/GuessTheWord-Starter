package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel( finalScore: Int): ViewModel() {
    val score = MutableLiveData<Int>()
    init {
        score.value = finalScore
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

}