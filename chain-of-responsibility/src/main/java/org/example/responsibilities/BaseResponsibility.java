package org.example.responsibilities;

import lombok.Setter;
import org.example.models.ContextData;

import java.util.Objects;

@Setter
public abstract class BaseResponsibility {

    public BaseResponsibility nextResponsibility;

    public abstract void performResponsibility(ContextData contextData);

    public void processNextResponsibility(ContextData contextData) {
        if (Objects.isNull(this.nextResponsibility)) {
            return;
        }
        this.nextResponsibility.performResponsibility(contextData);
    }
}
