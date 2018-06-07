package gittest;

public class Example {

    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Example{" +
                "id=" + id +
                '}';
    }

    public boolean isNew() {
        return this.id == null;
    }
}
