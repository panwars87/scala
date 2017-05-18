class Upper {
	//arg : multiple strings
	//return type is an arry of string
	def upper(strings: String*): Seq[String] = 
	{
	strings.map((s:String) => s.toUpperCase())
	}
}

//val up = new Upper
//println(up.upper("scala", "rocks", "functional", "programming"))

