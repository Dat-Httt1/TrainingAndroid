//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name1 = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name1 + "!")
    var name2 = "TatDat"

    println("xin chao " + name2 + "?" )

    for (i in 1..9) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    var number = 2
    println(number)

    val x: Int = 5
    val y: Long = x.toLong()
    println (y)

    var txt = "Xin chào"
    println(txt[4])
    println(txt[5])



}