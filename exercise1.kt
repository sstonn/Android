fun convert(chuoi:String){
	var arr = chuoi.split("")
    	var result:String = ""
    	for (i in arr){
        	when(i){
            		"G"->result += "C"
            		"C"->result += "G"
            		"T"->result += "A"
            		"A"->result += "U"
        	}
    	}
    	println(result)
}

fun main() {

	convert("GCTA")
  
}