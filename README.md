# MultiModuleBaseInterface
多模块，接口下沉到Base Module
很多时候，需要分成多个Module，有Base Module, 各级业务Module  
各级业务Module会依赖BaseModule,并且相互之间不能有依赖关系, 最终主工程app Module会依赖各级子Module  
![image](https://github.com/zzzzKidd/MultiModuleBaseInterface/blob/master/1842860141.jpg)  
各级业务Module之间虽然不能相互依赖，但是可能会有功能调用，此时就需要业务Module的功能接口下沉到Base Module中,同级业务Module就可以通过Base Module的接口来调用其他业务Module的功能  
Base Module的中的接口需要在业务子Module的子类中实现，业务子Module的初始化方法在app Module中调用,并且在初始化方法中将对象放入Base Module中, 供其他Module使用
