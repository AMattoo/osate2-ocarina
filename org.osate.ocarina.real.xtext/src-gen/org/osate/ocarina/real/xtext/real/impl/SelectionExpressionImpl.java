/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.SelectionExpression;
import org.osate.ocarina.real.xtext.real.TerminalSelectionExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.SelectionExpressionImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.SelectionExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.SelectionExpressionImpl#getE2 <em>E2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionExpressionImpl extends MinimalEObjectImpl.Container implements SelectionExpression
{
  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected TerminalSelectionExpression e1;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EList<String> op;

  /**
   * The cached value of the '{@link #getE2() <em>E2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE2()
   * @generated
   * @ordered
   */
  protected EList<TerminalSelectionExpression> e2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RealPackage.Literals.SELECTION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalSelectionExpression getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(TerminalSelectionExpression newE1, NotificationChain msgs)
  {
    TerminalSelectionExpression oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.SELECTION_EXPRESSION__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(TerminalSelectionExpression newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.SELECTION_EXPRESSION__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.SELECTION_EXPRESSION__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.SELECTION_EXPRESSION__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOp()
  {
    if (op == null)
    {
      op = new EDataTypeEList<String>(String.class, this, RealPackage.SELECTION_EXPRESSION__OP);
    }
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TerminalSelectionExpression> getE2()
  {
    if (e2 == null)
    {
      e2 = new EObjectContainmentEList<TerminalSelectionExpression>(TerminalSelectionExpression.class, this, RealPackage.SELECTION_EXPRESSION__E2);
    }
    return e2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RealPackage.SELECTION_EXPRESSION__E1:
        return basicSetE1(null, msgs);
      case RealPackage.SELECTION_EXPRESSION__E2:
        return ((InternalEList<?>)getE2()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RealPackage.SELECTION_EXPRESSION__E1:
        return getE1();
      case RealPackage.SELECTION_EXPRESSION__OP:
        return getOp();
      case RealPackage.SELECTION_EXPRESSION__E2:
        return getE2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RealPackage.SELECTION_EXPRESSION__E1:
        setE1((TerminalSelectionExpression)newValue);
        return;
      case RealPackage.SELECTION_EXPRESSION__OP:
        getOp().clear();
        getOp().addAll((Collection<? extends String>)newValue);
        return;
      case RealPackage.SELECTION_EXPRESSION__E2:
        getE2().clear();
        getE2().addAll((Collection<? extends TerminalSelectionExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RealPackage.SELECTION_EXPRESSION__E1:
        setE1((TerminalSelectionExpression)null);
        return;
      case RealPackage.SELECTION_EXPRESSION__OP:
        getOp().clear();
        return;
      case RealPackage.SELECTION_EXPRESSION__E2:
        getE2().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RealPackage.SELECTION_EXPRESSION__E1:
        return e1 != null;
      case RealPackage.SELECTION_EXPRESSION__OP:
        return op != null && !op.isEmpty();
      case RealPackage.SELECTION_EXPRESSION__E2:
        return e2 != null && !e2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //SelectionExpressionImpl