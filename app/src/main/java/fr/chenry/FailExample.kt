package fr.chenry

class FailExample(private val cb: FailExample.() -> Unit) {
    init {
        cb(this)
    }
}
