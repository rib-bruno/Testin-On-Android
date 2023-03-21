package com.example.testcase

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before

import org.junit.Test

class ResourceCompareTest {

   // private val resourceCompare = ResourceCompare() //prática ruim. todos os testes devem ser executados independemente uns dos outros

    private lateinit var resourceCompare : ResourceCompare //inicializar em cada test para que eles tenham a própria instância

    @Before
    fun setup(){
        //escrever a lógica que queremos executar antes da execução de cada testcase
        resourceCompare = ResourceCompare()
    }

    @After
    fun teardown() {
        //ex abrir e fechar o room database
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
      //  resourceCompare = ResourceCompare() //obtendo o objeto context no diretório de testes
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "TestCase")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
      //  resourceCompare = ResourceCompare() //obtendo o objeto context no diretório de testes
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "Hello")
        assertThat(result).isFalse()
    }
}