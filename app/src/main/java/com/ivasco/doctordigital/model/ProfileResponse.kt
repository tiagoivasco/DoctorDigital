package com.ivasco.doctordigital.model

data class ProfileResponse(val results: List<ProfileItem>)
data class ProfileItem(val email: String, val password: String)