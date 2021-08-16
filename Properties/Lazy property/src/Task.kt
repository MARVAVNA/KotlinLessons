class LazyProperty(val initializer: () -> Int) {
    /* TODO */
    val lazy: Int
        get() {
            TODO()
        }
}


/*
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}

Question

 */