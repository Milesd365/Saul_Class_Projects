package DakinTree


import DakinTree.TreeClassifiers._
import Readers.TreeReader
import scala.collection.JavaConversions._
object TreeApp extends App{

  val allTreesTrain= new TreeReader("data/Dakin_Train.csv").trees
  val allTreesTest= new TreeReader("data/Dakin_test.csv").trees

  TreeDataModel.tree.populate(allTreesTrain)
  TreeDataModel.tree.populate(allTreesTest,false)

  TreeClassifier.learn(5)
  TreeClassifier.test()
}