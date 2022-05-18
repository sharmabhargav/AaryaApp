package com.aarya.aaryaapp;

import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class DefenseGuide extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_how_to_swipe);

        addFragment(new Step.Builder()
        .setTitle("1. Hammer strike")
        .setContent("Using your car keys is one of the easiest ways to defend yourself. Don’t use your fingernails, because you’re more at risk to injure your hands.\n" +
                "Instead, if you feel unsafe while walking at night, have your keys stick out from one side of your fist for hammer strikes.Another way to use your keys is to click them onto a lanyard to swing at your attacker.\n" +
                "\nTo perform:\n" +
                "1)Hold your key ring in a tight fist, like holding a hammer, with keys extending from the side of your hand.\n" +
                "2) Thrust downward toward your target.\n").setSummary("Technique 1")
        .setBackgroundColor(Color.parseColor("#CC0059"))
        .setDrawable(R.drawable.technique).build());

        addFragment(new Step.Builder()
                .setTitle("2. Groin kick")
                .setContent("If someone is coming at you from the front, a groin kick may deliver enough force to paralyze your attacker, making your escape possible.\n" +
                        "\n" +
                        "\n To perform:\n" +
                        "\n" +
                        "1) Stabilize yourself as best you can.\n" +
                        "2) Lift your dominant leg off the ground and begin to drive your knee upward.\n" +
                        "3) Extend your dominant leg, drive hips forward, slightly lean back, and kick forcefully, making contact between your lower shin or ball of your foot and the attacker’s groin area.\n" +
                        "\n Alternative: If your attacker is too close, thrust your knee toward the groin. Make sure you’re stabilized and not at risk of falling over.\n")
                .setSummary("Technique 2")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.technique2).build());

        addFragment(new Step.Builder()
                .setTitle("3. Heel palm strike")
                .setContent("This move can cause damage to the nose or throat. To execute, get in front of your attacker as much as is possible.\n" +
                        "\n" +
                        "To perform:\n" +
                        "\n" +
                        "1) your dominant hand, flex your wrist.\n" +
                        "2) Aim for either the attacker’s nose, jabbing upward from the nostrils, or underneath the attacker’s chin, jabbing upward at the throat.\n" +
                        "3) Make sure to recoil your strike. Pulling your arm back quickly will help thrust the attacker’s head up and back.\n" +
                        "4) This will cause your attacker to stagger backward, allowing you to escape their grasp.\n" +
                        "\nAlternative: An open palm to the ears can be very disorienting.\n" +
                        "\n")
                .setSummary("Technique 3")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.technique3).build());

        addFragment(new Step.Builder()
                .setTitle("4. Elbow strike")
                .setContent("If your attacker is in close range and you’re unable to get enough momentum to throw a strong punch or kick, use your elbows.\n" +
                        "\n" +
                        "To perform:\n" +
                        "\n" +
                        "1) If you can, stabilize yourself with a strong core and legs to ensure a powerful blow.\n" +
                        "2) Bend your arm at the elbow, shift your weight forward, and strike your elbow into your attacker’s neck, jawline, chin, or temple. These are all effective targets.\n" +
                        "3) This may cause your attacker to loosen their grip, allowing you to run.")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.technique4).build());

        addFragment(new Step.Builder()
                .setTitle("5. Alternative elbow strikes")
                .setContent("Depending on how you’re standing when you’re initially attacked, you may be in a better position for variations on the elbow strike.\n" +
                        "\n" +
                        "To perform from the front:\n" +
                        "\n" +
                        "1) Lift your elbow to shoulder height.\n" +
                        "2) Pivot on same-side foot and allow your hips to rotate, creating more momentum into the front part of your elbow when you strike.\n" +
                        "\n" +
                        "\n To perform from the side and back:\n" +
                        "\n" +
                        "1) Make sure you see the target.\n" +
                        "2) Bring your elbow up and pivot your opposite foot, rotating your hips and turning into the target, making contact with the back part of your elbow.")
                .setSummary("Technique 5")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.technique5).build());

        addFragment(new Step.Builder()
                .setTitle("6. Escape from a ‘bear hug attack’")
                .setContent("For cases where the attacker is coming from behind, you’ll want to use this move. Focus on getting low and creating space to free yourself.\n" +
                        "\n" +
                        "To perform:\n" +
                        "\n" +
                        "1) Bend forward from the waist. This shifts your weight forward, making it more difficult for your attacker to pick you up. It also gives you a better angle to throw elbows from side to side to the attacker’s face.\n" +
                        "2) Turn into the attacker with one of your elbows and continue counterattacking.\n" +
                        "3) This should give you space to turn fully, using another move to injure the face or strike the groin. With the space these moves have created, you may be able to escape and run away.")
                .setSummary("Technique 6")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.technique6).build());

        addFragment(new Step.Builder()
                .setTitle("7. Escape with hands trapped")
                .setContent("If your attacker comes from behind and traps your arms (this is similar to a bear hug, but you won’t be able to move as freely), here’s what to do:\n" +
                        "\n" +
                        "1) First reaction should be to stop your attacker’s arms from going higher into a headlock. Shift your hips to one side. This gives an opening for strikes to the groin with open-handed slaps.\n" +
                        "2) Bring your hand back up to your arms and raise your opposite elbow to turn into the wrap. Keep your arms tight to your chest as you’re turning in.\n" +
                        "3) Stay aggressive with your knees and other counterattacks until you can disengage.")
                .setSummary("Technique 7")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.technique7).build());

        addFragment(new Step.Builder()
                .setTitle("8. Escape from side headlock")
                .setContent("When the attacker locks their arm around your head from the side, your first instinct should be to avoid getting choked.\n" +
                        "\n" +
                        "To perform:\n" +
                        "\n" +
                        "1) Turn into the attacker’s side as much as possible to avoid being choked.\n" +
                        "2) With your hand that’s furthest away, strike the groin with open-handed slaps until you have enough mobility to turn your head all the way out to disengage.")
                .setSummary("Technique 8")
                .setBackgroundColor(Color.parseColor("#CC0059"))
                .setDrawable(R.drawable.technique8).build());
    }

    @Override
    public void currentFragmentPosition(int position) {

    }
}
