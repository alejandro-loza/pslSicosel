package sspc.gob.mx.psr.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class EntidadBase {

    @Column(updatable = false)
    @CreationTimestamp
    protected LocalDateTime dateCreated;

    @UpdateTimestamp
    protected LocalDateTime lastUpdated;

    @Column(updatable = false)
    @CreationTimestamp
    protected LocalDateTime dateDeleted;

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public LocalDateTime getDateDeleted() {
		return dateDeleted;
	}

	public void setDateDeleted(LocalDateTime dateDeleted) {
		this.dateDeleted = dateDeleted;
	}
    
    
}