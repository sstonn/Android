fun convertNum2String(num : Int):String{
    var result=""
    for(i in 2..num){
        if(num%i==0 && i==3) {
            result += "Pling"
        }else if(num%i==0 && i==5){
            result+="Plang"
        }else if(num%i==0 && i==7){
            result+="Plong"
        }
    }
    if(result==""){
        result+= "$num"
    }

    return result
}

fun main(args: Array<String>) {
    print(convertNum2String(34))
}