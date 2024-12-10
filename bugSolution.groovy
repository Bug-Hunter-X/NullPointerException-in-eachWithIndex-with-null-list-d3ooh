```groovy
def myMethod(List<String> list) {
  list?.eachWithIndex { String item, int index ->
    println "Item $index: $item"
  } ?: println "List is null"
}

myMethod(null)
```