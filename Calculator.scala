object Calculator {
	
	def main(args: Array[String]) {
		println("Running Calculator App")

		var x:Int = 10;
		var y:Int = 5;

		println("Addition : " +add(x,y))
		println("Subtract : " +minus(x,y))
		println("Multiply : " +multiply(x,y))
		println("Division : " +divide(x,y))
	}

	def add(x:Int, y:Int) = x+y
	def minus(x:Int, y:Int) = x-y
	def multiply(x:Int, y:Int) = x*y
	def divide(x:Int, y:Int) = if(y ==0) 0 else x/y

	/*def add(x:Int, y:Int) : Int = {
		x+y
	}

	def minus(x:Int, y:Int) : Int = {
		x-y
	}

	def multiply(x:Int, y:Int) : Int = {
		x*y
	}

	def divide(x:Int, y:Int) : Int = {
		if(y == 0) {
			0
		} else {
			x/y
		}
	}*/
}
