import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.mysimplelistapp.R

class FormDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.form_layout, container, false)


        val itemNameEditText = view.findViewById<EditText>(R.id.itemName)
        val itemPriceEditText = view.findViewById<EditText>(R.id.itemPrice)
        val submitButton = view.findViewById<Button>(R.id.submitButton)


        submitButton.setOnClickListener {
            val itemName = itemNameEditText.text.toString()
            val itemPrice = itemPriceEditText.text.toString()


            if (itemName.isNotEmpty() && itemPrice.isNotEmpty()) {
                Toast.makeText(context, "Item adicionado: $itemName, Preço: $itemPrice", Toast.LENGTH_SHORT).show()
                dismiss()
            } else {
                Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }




}
