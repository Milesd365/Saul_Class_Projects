package DakinTree

import edu.illinois.cs.cogcomp.lbjava.learn.{AdaBoost, SparseNetworkLearner, SupportVectorMachine}
import weka.classifiers.pmml.consumer.NeuralNetwork



object TreeClassifiers {
  import TreeDataModel._
  import edu.illinois.cs.cogcomp.saul.classifier.Learnable
  object TreeClassifier extends Learnable[String](tree) {
    def label = Treelabel
    override lazy val classifier = new SupportVectorMachine()
    /*
    Randomforest, SVM, SNL
     */
    override def feature = using(CanopyDensity,Elevation,TreeDBH,TreeHeight,Gene_rarity)


  }
}