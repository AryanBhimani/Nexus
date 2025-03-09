package com.ABMTechnoConsultants.nexus.presentation.Viewmodels

import androidx.lifecycle.ViewModel
import com.ABMTechnoConsultants.nexus.Models.PhoneAuthUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PhoneAuthViewModel @Inject constructor() : ViewModel(){
     private val _authState = MutableStateFlow<AuthState>(AuthState.Ideal)
    val authState =_authState.asStateFlow()
}

sealed class AuthState{
    object Ideal: AuthState()
    object Loading: AuthState()
    data class CodeSent (val verificationId: String)
    data class Success (val user: PhoneAuthUser): AuthState()
    data class Error (val message: String): AuthState()
}