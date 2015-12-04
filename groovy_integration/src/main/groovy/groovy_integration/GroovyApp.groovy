package groovy_integration

class GroovyApp {

  static void main(def args){
    def mylist= [1,2,"Lars","4"]
    mylist.each{ println it }
  }
}
