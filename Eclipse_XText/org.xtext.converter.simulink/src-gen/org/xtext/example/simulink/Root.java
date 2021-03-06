/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.simulink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.simulink.Root#getRootElement <em>Root Element</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.simulink.SimulinkPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Root Element</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.simulink.SubElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Element</em>' containment reference list.
   * @see org.xtext.example.simulink.SimulinkPackage#getRoot_RootElement()
   * @model containment="true"
   * @generated
   */
  EList<SubElement> getRootElement();

} // Root
