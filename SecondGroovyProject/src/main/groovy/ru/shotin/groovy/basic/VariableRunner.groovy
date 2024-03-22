package ru.shotin.groovy.basic
import java.sql.Date as SqlDate
class VariableRunner {
    /**
     * byte, - 1 byte
     * short, - 2 byte
     * int, - 4 byte
     * long, - 8 byte
     * BigInteger
     * float, - 4 byte
     * double, - 8 byte
     * BigDecimal
     * char - 2 byte
     * boolean - 4 byte
     * @param zzz
     */
    static void main(String... zzz) {
        def int1 = 36G
        def decimal1 = 36.6G
        def sqlDate1 = new SqlDate(System.currentTimeMillis())
        println "int1=${int1} decimal1=${decimal1} sqlDate1=${sqlDate1}"
    }


}
