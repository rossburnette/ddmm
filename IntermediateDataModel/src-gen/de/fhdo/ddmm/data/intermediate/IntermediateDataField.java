/**
 */
package de.fhdo.ddmm.data.intermediate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Data field
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getName <em>Name</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#isHidden <em>Hidden</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#isDerived <em>Derived</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getType <em>Type</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getDataStructure <em>Data Structure</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getListType <em>List Type</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField()
 * @model
 * @generated
 */
public interface IntermediateDataField extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField_Name()
     * @model unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qualified Name</em>' attribute.
     * @see #setQualifiedName(String)
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField_QualifiedName()
     * @model unique="false"
     * @generated
     */
    String getQualifiedName();

    /**
     * Sets the value of the '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getQualifiedName <em>Qualified Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qualified Name</em>' attribute.
     * @see #getQualifiedName()
     * @generated
     */
    void setQualifiedName(String value);

    /**
     * Returns the value of the '<em><b>Hidden</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hidden</em>' attribute.
     * @see #setHidden(boolean)
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField_Hidden()
     * @model unique="false"
     * @generated
     */
    boolean isHidden();

    /**
     * Sets the value of the '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#isHidden <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hidden</em>' attribute.
     * @see #isHidden()
     * @generated
     */
    void setHidden(boolean value);

    /**
     * Returns the value of the '<em><b>Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Derived</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Derived</em>' attribute.
     * @see #setDerived(boolean)
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField_Derived()
     * @model unique="false"
     * @generated
     */
    boolean isDerived();

    /**
     * Sets the value of the '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#isDerived <em>Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Derived</em>' attribute.
     * @see #isDerived()
     * @generated
     */
    void setDerived(boolean value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.intermediate.IntermediateType#getDataField <em>Data Field</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(IntermediateType)
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField_Type()
     * @see de.fhdo.ddmm.data.intermediate.IntermediateType#getDataField
     * @model opposite="dataField" containment="true"
     * @generated
     */
    IntermediateType getType();

    /**
     * Sets the value of the '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(IntermediateType value);

    /**
     * Returns the value of the '<em><b>Data Structure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataStructure#getDataFields <em>Data Fields</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Structure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Structure</em>' container reference.
     * @see #setDataStructure(IntermediateDataStructure)
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField_DataStructure()
     * @see de.fhdo.ddmm.data.intermediate.IntermediateDataStructure#getDataFields
     * @model opposite="dataFields" transient="false"
     * @generated
     */
    IntermediateDataStructure getDataStructure();

    /**
     * Sets the value of the '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getDataStructure <em>Data Structure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Structure</em>' container reference.
     * @see #getDataStructure()
     * @generated
     */
    void setDataStructure(IntermediateDataStructure value);

    /**
     * Returns the value of the '<em><b>List Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.intermediate.IntermediateListType#getDataFields <em>Data Fields</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Type</em>' container reference.
     * @see #setListType(IntermediateListType)
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage#getIntermediateDataField_ListType()
     * @see de.fhdo.ddmm.data.intermediate.IntermediateListType#getDataFields
     * @model opposite="dataFields" transient="false"
     * @generated
     */
    IntermediateListType getListType();

    /**
     * Sets the value of the '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField#getListType <em>List Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List Type</em>' container reference.
     * @see #getListType()
     * @generated
     */
    void setListType(IntermediateListType value);

} // IntermediateDataField
