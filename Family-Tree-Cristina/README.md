The family tree application manages a list of related
people.

Assumptions
===========

-   The user will utilise the family tree by interaction with a mouse
    and keyboard

-   The family tree will obey conventional
    families (mother-father-children)

Requirements & Specifications
=============================

The family tree application requires the user to manage a list of
related people. Opening an existing tree, creating a new tree and viewing one
person and immediate relatives at any given time are the basic
requirements that need to be met. The GUI application was required to
use jFileChooser, exception handling and serialisation.

User Guide
==========

To use the application, interact with the available buttons and menus on
the GUI. 

Structure & Design 
===================

The design approach was modular separating the GUI from backend logic.
The strategy for completing this assignment was to develop the specific
classes first such as Family Member, Family Tree and Address and test
them through textual methods to make sure the functions were working as
intended. By doing this, it allowed much smoother integration of the GUI
with the base classes.
