package com.raquo.dombuilder.builders.nodes

import com.raquo.dombuilder.nodes.Element

/** A Tag is an [[Element]] builder */
trait Tag[+El <: Element[N, R], N, +R] extends NodeBuilder[El, N, R] {

  val tagName: String

  override def createNode(): El with N
}