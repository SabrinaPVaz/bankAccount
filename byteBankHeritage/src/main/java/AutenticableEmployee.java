interface Autenticable {
    public abstract void setPassword(int password);

    public abstract boolean authenticate(int password);
}
