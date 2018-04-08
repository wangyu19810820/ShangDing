package domain;

import org.apache.commons.lang.builder.ToStringBuilder;

public class BaseDomain {

    private static final long serialVersionUID = -6038001599431276800L;

    public BaseDomain() {
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
