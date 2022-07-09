package task_5

class Vector2D(private var x: Int = 0, private var y: Int = 0) {
    fun add(vector: Vector2D) {
        this.x += vector.getX()
        this.y += vector.getY()
    }

    fun subtract(vector: Vector2D) {
        this.x -= vector.getX()
        this.y -= vector.getY()
    }

    fun multiply(num: Int) {
        this.x *= num
        this.y *= num
    }

    fun print(){
        println("x: $x y: $y")
    }

    fun getX(): Int {
        return this.x
    }

    fun getY(): Int {
        return this.y
    }

}