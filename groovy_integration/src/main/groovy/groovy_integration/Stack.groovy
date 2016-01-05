package groovy_integration

class Stack<T>
{
  List<T> elems = []
  def push(T x) { elems << x }
  def T top() { elems.head() }
  def List<T> pop() { elems = elems.tail() }
}
