
package com.google.api.ads.adwords.jaxws.v201509.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Adds labels to the AdGroupCriterion or removes labels from the AdGroupCriterion
 *             <p>Add - Apply an existing label to an existing
 *             {@linkplain AdGroupCriterion ad group criterion}. The {@code adGroupId} and
 *             {@code criterionId}
 *             must reference an existing {@linkplain AdGroupCriterion ad group criterion}. The
 *             {@code labelId} must reference an existing
 *             {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.
 *             <p>Remove - Removes the link between the specified
 *             {@linkplain AdGroupCriterion ad group criterion} and
 *             {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.</p>
 *             @param operations the operations to apply
 *             @return a list of AdGroupCriterionLabel where each entry in the list is the result of
 *             applying the operation in the input list with the same index. For an
 *             add operation, the returned AdGroupCriterionLabel contains the AdGroupId, CriterionId and the
 *             LabelId. In the case of a remove operation, the returned AdGroupCriterionLabel will only have
 *             AdGroupId and CriterionId.
 *             @throws ApiException when there are one or more errors with the request
 *           
 * 
 * <p>Java class for mutateLabel element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutateLabel">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201509}AdGroupCriterionLabelOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operations"
})
@XmlRootElement(name = "mutateLabel")
public class AdGroupCriterionServiceInterfacemutateLabel {

    protected List<AdGroupCriterionLabelOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupCriterionLabelOperation }
     * 
     * 
     */
    public List<AdGroupCriterionLabelOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<AdGroupCriterionLabelOperation>();
        }
        return this.operations;
    }

}
