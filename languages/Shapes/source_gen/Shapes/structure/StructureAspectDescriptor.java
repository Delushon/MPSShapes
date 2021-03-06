package Shapes.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptCanvas = createDescriptorForCanvas();
  /*package*/ final ConceptDescriptor myConceptCircle = createDescriptorForCircle();
  /*package*/ final ConceptDescriptor myConceptColor = createDescriptorForColor();
  /*package*/ final ConceptDescriptor myConceptColorReference = createDescriptorForColorReference();
  /*package*/ final ConceptDescriptor myConceptShape = createDescriptorForShape();
  /*package*/ final ConceptDescriptor myConceptSquare = createDescriptorForSquare();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptCanvas, myConceptCircle, myConceptColor, myConceptColorReference, myConceptShape, myConceptSquare);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Canvas:
        return myConceptCanvas;
      case LanguageConceptSwitch.Circle:
        return myConceptCircle;
      case LanguageConceptSwitch.Color:
        return myConceptColor;
      case LanguageConceptSwitch.ColorReference:
        return myConceptColorReference;
      case LanguageConceptSwitch.Shape:
        return myConceptShape;
      case LanguageConceptSwitch.Square:
        return myConceptSquare;
      default:
        return null;
    }
  }


  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForCanvas() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Shapes", "Canvas", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x27d2d92974d50d06L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0x4caf0310491e41f5L, 0x8a9b2006b3a94898L, 0x40c1a7cb987d20d5L);
    b.origin("r:898985b2-1b69-43fe-bb53-edcaa35b3f84(Shapes.structure)/2869594684665433350");
    b.version(2);
    b.aggregate("shapes", 0x27d2d92974d50d0fL).target(0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x27d2d92974d50ce0L).optional(true).ordered(true).multiple(true).origin("2869594684665433359").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCircle() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Shapes", "Circle", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x27d2d92974d50ce5L);
    b.class_(false, false, false);
    b.super_("Shapes.structure.Shape", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x27d2d92974d50ce0L);
    b.origin("r:898985b2-1b69-43fe-bb53-edcaa35b3f84(Shapes.structure)/2869594684665433317");
    b.version(2);
    b.property("x", 0x27d2d92974d50ce7L).type(PrimitiveTypeId.INTEGER).origin("2869594684665433319").done();
    b.property("y", 0x27d2d92974d50cedL).type(PrimitiveTypeId.INTEGER).origin("2869594684665433325").done();
    b.property("radius", 0x27d2d92974d50cf0L).type(PrimitiveTypeId.INTEGER).origin("2869594684665433328").done();
    b.alias("circle");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForColor() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Shapes", "Color", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x620c9e3d7ba361e3L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:898985b2-1b69-43fe-bb53-edcaa35b3f84(Shapes.structure)/7065195902341964259");
    b.version(2);
    b.alias("color");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForColorReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Shapes", "ColorReference", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x620c9e3d7ba3ab3cL);
    b.class_(false, false, false);
    b.origin("r:898985b2-1b69-43fe-bb53-edcaa35b3f84(Shapes.structure)/7065195902341983036");
    b.version(2);
    b.associate("target", 0x620c9e3d7ba3ab3dL).target(0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x620c9e3d7ba361e3L).optional(false).origin("7065195902341983037").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForShape() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Shapes", "Shape", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x27d2d92974d50ce0L);
    b.class_(false, true, false);
    b.origin("r:898985b2-1b69-43fe-bb53-edcaa35b3f84(Shapes.structure)/2869594684665433312");
    b.version(2);
    b.aggregate("color", 0x620c9e3d7ba450ceL).target(0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x620c9e3d7ba3ab3cL).optional(false).ordered(true).multiple(false).origin("7065195902342025422").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSquare() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Shapes", "Square", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x27d2d92974d50cfcL);
    b.class_(false, false, false);
    b.super_("Shapes.structure.Shape", 0xe33629f1abe04beaL, 0x914c8d52453ac877L, 0x27d2d92974d50ce0L);
    b.origin("r:898985b2-1b69-43fe-bb53-edcaa35b3f84(Shapes.structure)/2869594684665433340");
    b.version(2);
    b.property("upperLeftX", 0x27d2d92974d50cfdL).type(PrimitiveTypeId.INTEGER).origin("2869594684665433341").done();
    b.property("upperLeftY", 0x27d2d92974d50cffL).type(PrimitiveTypeId.INTEGER).origin("2869594684665433343").done();
    b.property("size", 0x27d2d92974d50d02L).type(PrimitiveTypeId.INTEGER).origin("2869594684665433346").done();
    b.alias("square");
    return b.create();
  }
}
