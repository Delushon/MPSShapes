<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f474cd04-d3b0-408e-b204-abf8b8f2c9a0(Shapes.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="e33629f1-abe0-4bea-914c-8d52453ac877" name="Shapes" version="0" />
  </languages>
  <imports>
    <import index="nrtc" ref="r:beb98844-5fbc-415a-a59a-d612689b1c9c(Shapes.colors)" implicit="true" />
  </imports>
  <registry>
    <language id="e33629f1-abe0-4bea-914c-8d52453ac877" name="Shapes">
      <concept id="7065195902341983036" name="Shapes.structure.ColorReference" flags="ng" index="pFNk1">
        <reference id="7065195902341983037" name="target" index="pFNk0" />
      </concept>
      <concept id="2869594684665433350" name="Shapes.structure.Canvas" flags="ng" index="1j1XgJ">
        <child id="2869594684665433359" name="shapes" index="1j1XgA" />
      </concept>
      <concept id="2869594684665433312" name="Shapes.structure.Shape" flags="ng" index="1j1Xn9">
        <child id="7065195902342025422" name="color" index="pEcVN" />
      </concept>
      <concept id="2869594684665433317" name="Shapes.structure.Circle" flags="ng" index="1j1Xnc">
        <property id="2869594684665433325" name="y" index="1j1Xn4" />
        <property id="2869594684665433319" name="x" index="1j1Xne" />
        <property id="2869594684665433328" name="radius" index="1j1Xnp" />
      </concept>
      <concept id="2869594684665433340" name="Shapes.structure.Square" flags="ng" index="1j1Xnl">
        <property id="2869594684665433346" name="size" index="1j1XgF" />
        <property id="2869594684665433341" name="upperLeftX" index="1j1Xnk" />
        <property id="2869594684665433343" name="upperLeftY" index="1j1Xnm" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1j1XgJ" id="2viQi_OPhhs">
    <property role="TrG5h" value="MyDrawing" />
    <node concept="1j1Xnc" id="2viQi_OPhht" role="1j1XgA">
      <property role="1j1Xne" value="10" />
      <property role="1j1Xn4" value="20" />
      <property role="1j1Xnp" value="30" />
      <node concept="pFNk1" id="68cBzPVDgoE" role="pEcVN">
        <ref role="pFNk0" to="nrtc:68cBzPVCUGS" resolve="green" />
      </node>
    </node>
    <node concept="1j1Xnl" id="2viQi_OPhhy" role="1j1XgA">
      <property role="1j1Xnk" value="100" />
      <property role="1j1Xnm" value="200" />
      <property role="1j1XgF" value="50" />
      <node concept="pFNk1" id="68cBzPVDgoG" role="pEcVN">
        <ref role="pFNk0" to="nrtc:68cBzPVCUGU" resolve="yellow" />
      </node>
    </node>
  </node>
</model>

