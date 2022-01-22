fun main() {
    var temperature = 0.0

    println("Please enter a your temperature: ")
    temperature = readLine()!!.toDouble()

    if(temperature < 97.5)
        println("Your temperature is low")
    else if(temperature >= 97.5 && temperature <= 99.5)
        println("Your temperature is normal")
    else
        println("Your temperature is high")
}