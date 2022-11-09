package com.ahrorovk.AhrorovDictionary.Screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ҳ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3A
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ё
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Б
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3В
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Г
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Д
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ж
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3З
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3И
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3К
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Л
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3М
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Н
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3О
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3П
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Р
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3С
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3У
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ф
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Х
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ч
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ш
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Э
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Я
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ғ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Қ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ҷ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfMp3Ӯ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfAudio.listOfmP3Т
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkA
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_2
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_1
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_10
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_11
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_14
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_15
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_16
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_17
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_18
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_19
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_20
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_21
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_22
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_23
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_24
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_25
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_26
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_27
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_28
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_29
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_3
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_30
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_31
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_33
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_35
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_4
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_5
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_6
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_8
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories.word_9
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnA
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnB
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnЁ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnБ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnГ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnД
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnЖ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnЗ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnИ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnК
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnЛ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnМ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnН
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnО
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnП
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnР
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnС
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnТ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnУ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnФ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnХ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnЧ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnШ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnЭ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnЯ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnҒ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnҚ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnҲ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnҶ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfEnglish.listOfEnӮ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuB
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuЁ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuА
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuБ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuГ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuД
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuЖ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuЗ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuИ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuК
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuЛ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuМ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuН
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuО
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuП
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuР
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuС
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuТ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuУ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuФ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuХ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuЧ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuШ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuЭ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuЯ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuҒ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuҚ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuҲ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuҶ
import com.ahrorovk.AhrorovDictionary.Lists.ListOfRu.listOfRuӮ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkB
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkЁ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkБ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkГ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkД
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkЖ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkЗ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkИ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkК
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkЛ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkМ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkН
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkО
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkП
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkР
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkС
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkТ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkУ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkФ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkХ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkЧ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkШ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkЭ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkЯ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkҒ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkҚ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkҲ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkҶ
import com.ahrorovk.AhrorovDictionary.Lists.listOfTjk.listOfTjkӮ
import com.ahrorovk.AhrorovDictionary.ui.theme.Green

class MainViewModel:ViewModel() {

    var searchTextField by mutableStateOf("")
    val listOfCategory = listOf(
        word_1,
        word_2,
        word_3,
        word_4,
        word_5,
        word_6,
        word_8,
        word_9,
        word_10,
        word_11,
        word_14,
        word_15,
        word_16,
        word_17,
        word_18,
        word_19,
        word_20,
        word_21,
        word_22,
        word_23,
        word_24,
        word_25,
        word_26,
        word_27,
        word_28,
        word_29,
        word_30,
        word_31,
        word_33,
        word_35,
    )
    val listOfTjkAWords = listOfTjkA
    val listOfTjkБWords = listOfTjkБ
    val listOfTjkBWords = listOfTjkB
    val listOfTjkWords = listOf(
        listOfTjkAWords,
        listOfTjkБWords,
        listOfTjkBWords,
        listOfTjkГ,
        listOfTjkҒ,
        listOfTjkД,
        listOfTjkЁ,
        listOfTjkЖ,
        listOfTjkЗ,
        listOfTjkИ,
        listOfTjkК,
        listOfTjkҚ,
        listOfTjkЛ,
        listOfTjkМ,
        listOfTjkН,
        listOfTjkО,
        listOfTjkП,
        listOfTjkР,
        listOfTjkС,
        listOfTjkТ,
        listOfTjkУ,
        listOfTjkӮ,
        listOfTjkФ,
        listOfTjkХ,
        listOfTjkҲ,
        listOfTjkЧ,
        listOfTjkҶ,
        listOfTjkШ,
        listOfTjkЭ,
        listOfTjkЯ
    )
    val listOfRuAWords = listOfRuА
    val listOfRuБWords = listOfRuБ
    val listOfRuBWords = listOfRuB
    val listOfRuWords = listOf(
        listOfRuAWords,
        listOfRuБWords,
        listOfRuBWords,
        listOfRuГ,
        listOfRuҒ,
        listOfRuД,
        listOfRuЁ,
        listOfRuЖ,
        listOfRuЗ,
        listOfRuИ,
        listOfRuК,
        listOfRuҚ,
        listOfRuЛ,
        listOfRuМ,
        listOfRuН,
        listOfRuО,
        listOfRuП,
        listOfRuР,
        listOfRuС,
        listOfRuТ,
        listOfRuУ,
        listOfRuӮ,
        listOfRuФ,
        listOfRuХ,
        listOfRuҲ,
        listOfRuЧ,
        listOfRuҶ,
        listOfRuШ,
        listOfRuЭ,
        listOfRuЯ
    )
    val listOfEnAWords = listOfEnA
    val listOfEnБWords = listOfEnБ
    val listOfEnBWords = listOfEnB
    val listOfEnWords = listOf(
        listOfEnAWords,
        listOfEnБWords,
        listOfEnBWords,
        listOfEnГ,
        listOfEnҒ,
        listOfEnД,
        listOfEnЁ,
        listOfEnЖ,
        listOfEnЗ,
        listOfEnИ,
        listOfEnК,
        listOfEnҚ,
        listOfEnЛ,
        listOfEnМ,
        listOfEnН,
        listOfEnО,
        listOfEnП,
        listOfEnР,
        listOfEnС,
        listOfEnТ,
        listOfEnУ,
        listOfEnӮ,
        listOfEnФ,
        listOfEnХ,
        listOfEnҲ,
        listOfEnЧ,
        listOfEnҶ,
        listOfEnШ,
        listOfEnЭ,
        listOfEnЯ,
    )
    val listOfAudio = listOf(
        listOfMp3A,
        listOfMp3Б,
        listOfMp3В,
        listOfMp3Г,
        listOfMp3Ғ,
        listOfMp3Д,
        listOfMp3Ё,
        listOfMp3Ж,
        listOfMp3З,
        listOfMp3И,
        listOfMp3К,
        listOfMp3Қ,
        listOfMp3Л,
        listOfMp3М,
        listOfMp3Н,
        listOfMp3О,
        listOfMp3П,
        listOfMp3Р,
        listOfMp3С,
        listOfmP3Т,
        listOfMp3У,
        listOfMp3Ӯ,
        listOfMp3Ф,
        listOfMp3Х,
        listOfMp3Ҳ,
        listOfMp3Ч,
        listOfMp3Ҷ,
        listOfMp3Ш,
        listOfMp3Э,
        listOfMp3Я
    )
    var col = mutableStateOf(Green)
    var category by mutableStateOf("")
    fun setSearch(text: String) {
        searchTextField = text
    }

    fun setCategories(text: String) {
        category = text
    }
}