new observer implementation:

I) observable side

1) observable has PropertyChangeSUpport initializaed in the constructor as:
support = new PropertyChangeSupport(this);

2) observable has 2 methods to add & remove PropertyChangeListener delegated to support:
support.add/removePropertyChangeListener(pcl);

3) observable notifies with support.firePropertyChange
(args.: String propertyName, Object, oldValue, Object newValue);

II) observer side

1) observer implements PropertyChangeListener interface

2) method: propertyChange(PropertyChangeEvent evt) -> evt.getNewValue();