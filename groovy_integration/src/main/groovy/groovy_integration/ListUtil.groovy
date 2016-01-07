package groovy_integration

class ListUtil
{
  def static List<Integer> giveMeList() {
    return [1, 2, 3]
  }

  def static Set giveMeSet() {
    return [1, 2, 3].toSet()
  }

  def static Map giveMeMap() {
    return [name: 'James', forename: 'Strachan']
  }

  def static Range giveMeRange() {
    return 1..3
  }
}

