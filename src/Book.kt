import kotlin.reflect.KClass

class Book(var title: String, var author: String, var year: Int) {

    fun titleAndAuthor(): String {
        var titleAndAuthorPair = title to author
        return "The title is ${titleAndAuthorPair.first} and the author is ${titleAndAuthorPair.second}"
    }

    fun triplePropertiesOfaBook() {
        val (title, author, year) = Triple(title, author, year)
        println(title)
        println(author)
        println(year)
    }
}

fun main(args: Array<String>) {
    var book: Book = Book("Normal people", "Sally Rooney", 2018)
    println(book.titleAndAuthor())
    book.triplePropertiesOfaBook()
}
