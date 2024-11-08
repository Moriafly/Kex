package com.xuncorp.kex.test

import com.xuncorp.kex.util.commonPath
import com.xuncorp.kex.util.platformPath
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.io.File

class FileUtilTest {

    @Test
    fun platformPath() {
        val file = File("C:/test/1.txt")
        assertEquals(file.platformPath, "C:\\test\\1.txt")
    }

    @Test
    fun commonPath() {
        val file = File("C:/test/../test/./1.txt")
        assertEquals(file.commonPath, "C:/test/1.txt")
    }

}