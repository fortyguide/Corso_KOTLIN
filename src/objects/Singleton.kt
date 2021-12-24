package objects

import java.time.Year

object DirittiRiservatiCompagnia{
    val annoCorrente = Year.now().value

    fun getTagLine() = "Computer S.R.C. Company"
    fun getCopyrightLine() = "Copyright \u00A9$annoCorrente Our Company. All rights reserved"
}

fun main() {
    println(DirittiRiservatiCompagnia.getTagLine())
    println(DirittiRiservatiCompagnia.getCopyrightLine())
}
