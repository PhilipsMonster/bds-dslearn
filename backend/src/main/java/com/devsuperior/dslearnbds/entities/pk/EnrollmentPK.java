package com.devsuperior.dslearnbds.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devsuperior.dslearnbds.entities.Offer;
import com.devsuperior.dslearnbds.entities.User;

@Embeddable
public class EnrollmentPK implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public EnrollmentPK() {
    }

    public EnrollmentPK(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return this.offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EnrollmentPK)) {
            return false;
        }
        EnrollmentPK enrollmentPK = (EnrollmentPK) o;
        return Objects.equals(user, enrollmentPK.user) && Objects.equals(offer, enrollmentPK.offer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, offer);
    }


}
