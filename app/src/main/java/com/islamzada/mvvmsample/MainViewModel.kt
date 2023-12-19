package com.islamzada.mvvmsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var productName = MutableLiveData<String>()
    var productCode = MutableLiveData<String>()
    var productDescription = MutableLiveData<String>()

    var result  = MutableLiveData<String>()

    private val productList = mutableListOf<Product>()

    fun addProduct(){
        productList.add(Product(productName.value.toString(),productCode.value.toString(),productDescription.value.toString()))
        productList.forEach{it-> println(it)}

        result.postValue("${productName.value} ${productCode.value} ${productDescription.value}")
    }

}