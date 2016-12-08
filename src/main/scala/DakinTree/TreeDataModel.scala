package DakinTree

import edu.illinois.cs.cogcomp.saul.datamodel.DataModel


object TreeDataModel extends DataModel{

  val tree= node[String]

  val CanopyDensity= property(tree){
    x: String => {
      val tokens= x.split(",")
      tokens(4).charAt(1).toString
    }
  }
  val TreeHeight= property(tree){
    x: String => {
      val tokens= x.split(",")
      tokens(2).charAt(1).toString
    }
  }
  val Gene_rarity= property(tree){
    x: String => {
      val tokens= x.split(",")
      tokens(7).charAt(1).toString
    }
  }
  val TreeDBH= property(tree){
    x: String => {
      val tokens= x.split(",")
      tokens(3).charAt(1).toString
    }
  }
  val DBH50= property(tree){
    x: String => {
      val tokens= x.split(",")
      tokens(5).charAt(1).toString
    }
  }
  val Elevation= property(tree){
    x: String => {
      val tokens= x.split(",")
      tokens(6).charAt(1).toString
    }
  }
  val Treelabel = property(tree){
    x: String => {
      val tokens= x.split(",")
      if (tokens(8).equals("1"))
        "Fruited"
      else
        "Did not fruit"
    }
  }
}
